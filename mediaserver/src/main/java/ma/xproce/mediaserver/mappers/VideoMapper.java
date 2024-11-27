package ma.xproce.mediaserver.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;

@Component
public class VideoMapper {
    private ModelMapper mapper = new ModelMapper();

    public Video fromVideo(UploadVideoRequest videoRequest) {
        return this.mapper.map(videoRequest, Video.class);
    }
}
