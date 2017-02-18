package helloworld.phunhb.bkav.danhsachsinhvien;

/**
 * Created by phunhb on 16/02/2017.
 */

public class SinhVien {
    private String mHoTen;
    private String mMSSV;
    private String mDiaChi;
    private int mHinhAnh;
    private String mLop;
    private String mDienThoai;
    private String mGrade;
    private float mCPA;
    private float mGPA;
    private String mStatus;


    public SinhVien(String mHoTen, String mMSSV, String mDiaChi, int mHinhAnh, String mLop, String mDienThoai, String mGrade, float mCPA, float mGPA, String mStatus) {
        this.mHoTen = mHoTen;
        this.mMSSV = mMSSV;
        this.mDiaChi = mDiaChi;
        this.mHinhAnh = mHinhAnh;
        this.mLop = mLop;
        this.mDienThoai = mDienThoai;
        this.mGrade = mGrade;
        this.mCPA = mCPA;
        this.mGPA = mGPA;
        this.mStatus = mStatus;
    }

    public String getmLop() {
        return mLop;
    }

    public void setmLop(String mLop) {
        this.mLop = mLop;
    }

    public String getmDienThoai() {
        return mDienThoai;
    }

    public void setmDienThoai(String mDienThoai) {
        this.mDienThoai = mDienThoai;
    }

    public String getmGrade() {
        return mGrade;
    }

    public void setmGrade(String mGrade) {
        this.mGrade = mGrade;
    }

    public float getmCPA() {
        return mCPA;
    }

    public void setmCPA(float mCPA) {
        this.mCPA = mCPA;
    }

    public float getmGPA() {
        return mGPA;
    }

    public void setmGPA(float mGPA) {
        this.mGPA = mGPA;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public SinhVien(){


    }

    public String getmDiaChi() {
        return mDiaChi;
    }

    public void setmDiaChi(String mDiaChi) {
        this.mDiaChi = mDiaChi;
    }

    public SinhVien(String mMSSV, String mHoTen,String diachi,int mHinhAnh) {

        this.mMSSV = mMSSV;
        this.mHoTen = mHoTen;
        this.mHinhAnh = mHinhAnh;
        this.mDiaChi=diachi;
    }

    public String getmHoTen() {
        return mHoTen;
    }

    public void setmHoTen(String mHoTen) {
        this.mHoTen = mHoTen;
    }

    public String getmMSSV() {
        return mMSSV;
    }

    public void setmMSSV(String mMSSV) {
        this.mMSSV = mMSSV;
    }

    public int getmHinhAnh() {
        return mHinhAnh;
    }

    public void setmHinhAnh(int mHinhAnh) {
        this.mHinhAnh = mHinhAnh;
    }
}
