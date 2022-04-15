package sankaku.proc;

import zukei.Zukei;

public class Sankaku extends Zukei {

  //プロパティ
  private int teihen;
  private int takasa;

  //コンストラクタ
  public Sankaku() {
  }

  public Sankaku(int teihen, int takasa) {
    this.teihen = teihen;
    this.takasa = takasa;
  }

  //メソッド
  public float getMenseki() {
    float menseki = 0;
    //三角形の面積を求める
    menseki = (float)teihen * (float)takasa / 2;
    return menseki;
  }

  public void sizeBigger(int widthRatio, int heightRatio) {
    teihen *= widthRatio;
    takasa *= heightRatio;
  }

  public static int numSide() {
    return 3;
  }

  //アクセサメソッド

  public int getTeihen() {
    return teihen;
  }

  public void setTeihen(int teihen) {
    this.teihen = teihen;
  }

  public int getTakasa() {
    return takasa;
  }

  public void setTakasa(int takasa) {
    this.takasa = takasa;
  }
}
