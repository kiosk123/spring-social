package social;

import org.springframework.social.UserIdSource;

/**
 * UserIdSource를 구현하여 현재 유저를 결정
 * 여기서는 하드 코딩되어 있지만 실제로는 유접ㄹ로 커넥션 정보를 저장한다음 처리
 */
public class StaticUserIdSource implements UserIdSource {

    private static final String DEFAULT_USERID = "anonymous";

    private String userId = DEFAULT_USERID;

    @Override
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
