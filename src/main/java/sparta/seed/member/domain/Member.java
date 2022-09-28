package sparta.seed.member.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sparta.seed.member.domain.dto.requestdto.NicknameRequestDto;
import sparta.seed.util.BaseEntity;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Getter
@NoArgsConstructor
public class Member extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String username;

  private String password;

  private String nickname;

  private String socialId;

  @Enumerated(EnumType.STRING)
  private Authority authority;

  private String profileImage;

  private int exp;


  @ElementCollection
  private Map<String,Boolean> dailyMission = new HashMap<>(6,1);

  private boolean isSecret;

  @Builder
  public Member(Long id, String username, String password, String nickname, String socialId, Authority authority, String profileImage,int exp) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.nickname = nickname;
    this.socialId = socialId;
    this.authority = authority;
    this.profileImage = profileImage;
    this.exp = exp;
  }

  public void updateNickname(NicknameRequestDto requestDto) {
    nickname = requestDto.getNickname();
  }

  public void updateIsSecret(boolean isSecret) {
    this.isSecret = isSecret;
  }

  public void addExp(int exp) {
    this.exp += exp;
  }
}