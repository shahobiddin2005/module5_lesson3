package uz.app;

import java.util.Optional;

public class UserStats {
    Long visitCount;

    public UserStats(Long visitCount) {
        this.visitCount = visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }

    public Optional<Long> getVisitCount() {
        return Optional.of(visitCount);
    }
}