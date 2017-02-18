package helloworld.phunhb.bkav.danhsachsinhvien;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerview_sinhvien);
        ArrayList<SinhVien> danhSachSinhVien=new ArrayList<>();
        danhSachSinhVien.add(new SinhVien("20141","Nguyen Huu Phu","Ha Noi",R.drawable.hinhnengirldep));
        danhSachSinhVien.add(new SinhVien("20142","Nguyen Huu Quy","Ha Noi",R.drawable.hinhnengirldepa));
        danhSachSinhVien.add(new SinhVien("20143","Nguyen Huu An","Ha Noi",R.drawable.hinhnengirldepb));
        danhSachSinhVien.add(new SinhVien("20144","Nguyen Huu Thanh","Ha Noi",R.drawable.hinhnengirldepc));
        danhSachSinhVien.add(new SinhVien("20145","Nguyen Huu Xuan","Ha Noi",R.drawable.hinhnengirldepd));
        danhSachSinhVien.add(new SinhVien("20146","Nguyen Huu Hai","Ha Noi",R.drawable.hinhnengirldepe));
        danhSachSinhVien.add(new SinhVien("20147","Nguyen Huu Ba","Ha Noi",R.drawable.hinhnengirldepf));
        danhSachSinhVien.add(new SinhVien("20148","Nguyen Huu Trung","Ha Noi",R.drawable.hinhnengirldepg));
        danhSachSinhVien.add(new SinhVien("20149","Nguyen Huu Ha","Ha Noi",R.drawable.hinhnengirldeph));
        danhSachSinhVien.add(new SinhVien("201410","Nguyen Huu Noi","Ha Noi",R.drawable.hinhnengirldepa));
        danhSachSinhVien.add(new SinhVien("201411","Nguyen Huu Viet","Ha Noi",R.drawable.hinhnengirldepd));
        danhSachSinhVien.add(new SinhVien("201412","Nguyen Huu Nam","Ha Noi",R.drawable.hinhnengirldeph));
        danhSachSinhVien.add(new SinhVien("201413","Nguyen Huu Bac","Ha Noi",R.drawable.hinhnengirldepg));
        danhSachSinhVien.add(new SinhVien("201414","Nguyen Huu Ninh","Ha Noi",R.drawable.hinhnengirldepk));
        SinhVienAdapter sinhVienAdapter=new SinhVienAdapter(this,danhSachSinhVien);
        mRecyclerView.setAdapter(sinhVienAdapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);




    }
}
