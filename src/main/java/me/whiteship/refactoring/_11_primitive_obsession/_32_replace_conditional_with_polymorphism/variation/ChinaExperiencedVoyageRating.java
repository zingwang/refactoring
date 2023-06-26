package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.variation;

import java.util.List;

public class ChinaExperiencedVoyageRating extends VoyageRating{
    public ChinaExperiencedVoyageRating(Voyage voyage, List<VoyageHistory> history) {
        super(voyage, history);
    }
    @Override
    protected int captainHistoryRisk() {
        return Math.max(super.captainHistoryRisk()-2, 0);
    }

    @Override
    protected int voyageRisk() {
        return super.voyageRisk();
    }

    @Override
    protected int voyageProfitFactor() {
        return super.voyageProfitFactor();
    }

    @Override
    protected int voyageLengthFactor() {
        int result=0;
        result += 3;
        if (this.voyage.length() > 12) result += 1;
        if (this.voyage.length() > 18) result -= 1;
        return result;
    }

    @Override
    protected int historyLengthFactor() {
        return  (this.history.size() > 10) ? 1 : 0 ;
    }

    @Override
    protected boolean hasChinaHistory() {
        return super.hasChinaHistory();
    }
}
