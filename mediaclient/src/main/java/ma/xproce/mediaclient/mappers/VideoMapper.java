package ma.xproce.mediaclient.mappers;

import ma.xproce.mediaclient.dtos.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;

@Component
public class VideoMapper {
    private ModelMapper mapper = new ModelMapper();

//    public Video fromVideo(UploadVideoRequest videoRequest) {
//        return this.mapper.map(videoRequest, Video.class);
//    }

    public VideoDto fromVideoProtoToVideoDto(Video video) {
        return this.mapper.map(video, VideoDto.class);
    }
}
