package ma.xproce.mediaclient.service;

import ma.xproce.mediaclient.dtos.VideoDto;
import ma.xproce.mediaclient.mappers.VideoMapper;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;
import org.xproce.lab.VideoServiceGrpc;

@Service
public class VideoServiceClient {
    @GrpcClient("mediaserver")
    VideoServiceGrpc.VideoServiceBlockingStub stub;
    @Autowired
    private VideoMapper mapper;
    public VideoDto uploadVideo(UploadVideoRequest videoRequest) {
        Video video = stub.uploadVideo(videoRequest);
        VideoDto videoDto = mapper.fromVideoProtoToVideoDto(video);
        return videoDto;
    }
}
