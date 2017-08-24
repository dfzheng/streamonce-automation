package mail;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.admin.directory.Directory;
import com.google.api.services.admin.directory.DirectoryScopes;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

public class Gsuite {
    /** Email of the Service Account */
    public static final String SERVICE_ACCOUNT_EMAIL = "jive-admin-addons-uat@appspot.gserviceaccount.com";

    /** Path to the Service Account's Private Key file */
    private static final String SERVICE_ACCOUNT_PKCS12_FILE_PATH = "/Users/dfzheng/Downloads/jive-admin-addons-uat-c211bb1de17a.p12";

    /**
     * Build and returns a Directory service object authorized with the service accounts
     * that act on behalf of the given user.
     *
     * @param userEmail The email of the user. Needs permissions to access the Admin APIs.
     * @return Directory service object that is ready to make requests.
     */
    public static Directory getDirectoryService(String userEmail) throws GeneralSecurityException,
            IOException, URISyntaxException {
        HttpTransport httpTransport = new NetHttpTransport();
        JacksonFactory jsonFactory = new JacksonFactory();
        List<String> scopes = new ArrayList<String>();
        scopes.add(DirectoryScopes.ADMIN_DIRECTORY_GROUP_MEMBER);
        GoogleCredential credential = new GoogleCredential.Builder()
                .setTransport(httpTransport)
                .setJsonFactory(jsonFactory)
                .setServiceAccountId(SERVICE_ACCOUNT_EMAIL)
                //       .setClientSecrets("107495441022329297030","" )
                .setServiceAccountScopes(scopes)
                .setServiceAccountUser(userEmail)
                .setServiceAccountPrivateKeyFromP12File(
                        new java.io.File(SERVICE_ACCOUNT_PKCS12_FILE_PATH))
                .build();

        /**if (!credential.refreshToken()) {
         throw new RuntimeException("Failed OAuth to refresh the token");
         }
         //credential.refreshToken()
         */
        Directory service = new Directory.Builder(httpTransport, jsonFactory, null)
                .setHttpRequestInitializer(credential).build();
        return service;
    }

}

