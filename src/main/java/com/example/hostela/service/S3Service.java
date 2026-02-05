package com.example.hostela.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;

import java.io.File;
import java.nio.file.Paths;

@Service
public class S3Service {

    private final S3Client s3Client;
    private final String bucketName;

    public S3Service(@Value("${aws.accessKeyId}") String accessKeyId,
                     @Value("${aws.secretKey}") String secretKey,
                     @Value("${aws.region}") String region,
                     @Value("${aws.s3.bucketName}") String bucketName) {
        this.s3Client = S3Client.builder()
                .region(Region.of(region))
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretKey)))
                .build();
        this.bucketName = bucketName;
    }

    public PutObjectResponse uploadFile(String keyName, File file) {
        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(keyName)
                .build();

        return s3Client.putObject(putObjectRequest, Paths.get(file.getAbsolutePath()));
    }
}