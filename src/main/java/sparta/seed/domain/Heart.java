package sparta.seed.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Heart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "proofId")
    private Proof proof;
    //누른 유저의 Pk
    private Long memberId;

    @Builder
    public Heart(Long id, Proof proof, Long memberId) {
        this.id = id;
        this.proof = proof;
        this.memberId = memberId;
    }


}
