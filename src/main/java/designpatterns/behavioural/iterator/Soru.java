package designpatterns.behavioural.iterator;

/**
 * @author hdereli
 * @since 7/13/2023
 */
public class Soru {

    private Long soruNo;

    public Soru(Long soruNo) {
        this.soruNo = soruNo;
    }

    public Long getSoruNo() {
        return soruNo;
    }

    public void setSoruNo(Long soruNo) {
        this.soruNo = soruNo;
    }
}
