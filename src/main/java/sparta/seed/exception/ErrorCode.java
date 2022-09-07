package sparta.seed.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    /**
     *  로그인 ,토큰관련
     */
    NEED_A_LOGIN(HttpStatus.OK, "400","로그인이 필요합니다."),
    INDEX_NOT_FOUND(HttpStatus.BAD_REQUEST,"400", "인덱스가 존재하지 않습니다."),
    BOARD_NOT_FOUND(HttpStatus.BAD_REQUEST,"400", "게시글을 찾을 수 없습니다."),
    UNKNOWN_ERROR(HttpStatus.BAD_REQUEST,"400", "토큰이 존재하지 않습니다."),
    WRONG_TYPE_TOKEN(HttpStatus.BAD_REQUEST,"400", "변조된 토큰입니다."),
    EXPIRED_TOKEN(HttpStatus.BAD_REQUEST,"401", "만료된 토큰입니다."),
    UNSUPPORTED_TOKEN(HttpStatus.BAD_REQUEST,"400", "변조된 토큰입니다."),
    ACCESS_DENIED(HttpStatus.BAD_REQUEST,"400", "권한이 없습니다.");







    private final HttpStatus httpStatus;
    private final String errorCode;
    private final String msg;
}

