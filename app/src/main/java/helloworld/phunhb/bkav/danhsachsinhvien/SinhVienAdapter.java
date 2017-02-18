package helloworld.phunhb.bkav.danhsachsinhvien;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by phunhb on 17/02/2017.
 */

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.SinhVienViewHolder> {
    private ArrayList<SinhVien> mDanhSachSinhVien;
    private Context mContext;
    LayoutInflater mLayoutInflater;
    SinhVienAdapter(Context context,ArrayList<SinhVien> danhsachsinhvien){
        super();
        this.mContext=context;
        this.mDanhSachSinhVien=danhsachsinhvien;
        this.mLayoutInflater=LayoutInflater.from(context);

    }

    @Override
    public SinhVienViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= mLayoutInflater.inflate(R.layout.sinhvien_layout,parent,false);
        return new SinhVienViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SinhVienViewHolder holder, int position) {
        SinhVien sinhVien=mDanhSachSinhVien.get(position);
//        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.pikalong);
//        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);
//
//        ImageView circularImageView = (ImageView) findViewById(R.id.imageView);
//        circularImageView.setImageBitmap(circularBitmap);


        holder.imageview_avatar.setImageResource(sinhVien.getmHinhAnh());

        holder.textView_hoten.setText(sinhVien.getmHoTen());
        holder.textView_mssv.setText(sinhVien.getmMSSV());
        holder.textView_diachi.setText(sinhVien.getmDiaChi());

    }

    @Override
    public int getItemCount() {
        return mDanhSachSinhVien.size();
    }

    class SinhVienViewHolder extends RecyclerView.ViewHolder{
        TextView textView_mssv,textView_hoten,textView_diachi;
        CircleImageView imageview_avatar;
        SinhVienViewHolder(View itemView){
            super(itemView);
            textView_hoten=(TextView)itemView.findViewById(R.id.textview_hoten);
            textView_diachi=(TextView)itemView.findViewById(R.id.textview_diachi);
            textView_mssv=(TextView)itemView.findViewById(R.id.textview_mssv);
          imageview_avatar=(CircleImageView) itemView.findViewById(R.id.imageview_avatar);
        }
    }

}
