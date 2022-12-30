package io.github.farrukhjon.experiment.java.enumtest;

public class PassingObjectAsAMethodParam {

  public static void main(String[] args) {
    NonRegDetail nonRegDetail = new NonRegDetail();
    nonRegDetail.setBaseCcy("JPY");
    TradeInfo tradeInfo = new TradeInfo();
    tradeInfo.setNonRegDetail(nonRegDetail);
    convertTo(tradeInfo, "USD");
    String baseCcy = tradeInfo.getNonRegDetail().getBaseCcy();
    assert baseCcy.equals("USD");
  }

  private static void convertTo(TradeInfo tradeInfo, String to) {
    NonRegDetail nonRegDetail = tradeInfo.getNonRegDetail();
    String baseCcy = nonRegDetail.getBaseCcy();
    assert baseCcy.equals("JPY");
    nonRegDetail.setBaseCcy(to);
  }

  private static class TradeInfo {
    private NonRegDetail nonRegDetail;

    public NonRegDetail getNonRegDetail() {
      return nonRegDetail;
    }

    public void setNonRegDetail(NonRegDetail nonRegDetail) {
      this.nonRegDetail = nonRegDetail;
    }
  }

  private static class NonRegDetail {
    private String baseCcy;

    public String getBaseCcy() {
      return baseCcy;
    }

    public void setBaseCcy(String baseCcy) {
      this.baseCcy = baseCcy;
    }
  }
}
