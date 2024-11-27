package ma.xproce.mediaserver.service;

import io.grpc.stub.StreamObserver;
import ma.xproce.mediaserver.mappers.VideoMapper;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;
import org.xproce.lab.VideoServiceGrpc;

@GrpcService
public class VideoService extends VideoServiceGrpc.VideoServiceImplBase {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public void uploadVideo(UploadVideoRequest request, StreamObserver<Video> responseObserver) {
        Video video = videoMapper.fromVideo(request);
        responseObserver.onNext(video);
        responseObserver.onCompleted();
    }
}
