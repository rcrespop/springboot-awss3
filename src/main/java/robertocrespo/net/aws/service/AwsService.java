package robertocrespo.net.aws.service;

import robertocrespo.net.aws.model.Asset;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface AwsService {

    String getS3FileContent(String bucketName, String fileName) throws IOException;

    List<Asset> getS3Files(String bucketName) throws IOException;

    byte[] downloadFile(String bucketName, String fileName) throws IOException;

    void moveObject(String bucketName, String fileKey, String destinationFileKey);

    void deleteObject (String bucketName, String fileKey);

    String uploadFile(String bucketName, String filePath, MultipartFile file);
}
