        package com.example.intent;


        import android.content.Intent;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.constraintlayout.widget.ConstraintLayout;
        import androidx.recyclerview.widget.RecyclerView;

        import com.bumptech.glide.Glide;

        import java.util.ArrayList;

        public class Popular extends RecyclerView.Adapter<Popular.viewholder> {
        ArrayList<FoodDomain> foodDomains;

        public Popular(ArrayList<FoodDomain> FoodDomains) {
            this.foodDomains = FoodDomains;
        }

        @NonNull
        @Override
        public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);

            return new viewholder(inflate);
        }

        @Override
        public void onBindViewHolder(@NonNull viewholder holder, int position) {

            holder.title.setText(foodDomains.get(position).getTitle());
            holder.fee.setText(String.valueOf(foodDomains.get(position).getFee()));


            int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(foodDomains.get(position).getPic(), "drawable", holder.itemView.getContext().getPackageName());



                Glide
                        .with(holder.itemView.getContext())

                        .load(drawableResourceId)
                        .into(holder.pic);

                holder.addBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Intent intent = new Intent(holder.itemView.getContext(),ShowDetailActivity.class);

                        intent.putExtra("object" , foodDomains.get(position));

                        holder.itemView.getContext().startActivity(intent);

                    }
                });


        }


        @Override
        public int getItemCount() {


            return foodDomains.size();
        }

        public class viewholder extends RecyclerView.ViewHolder{

         ImageView pic;

         TextView title,fee;

         TextView addBtn ;



            public viewholder(@NonNull View itemView) {
                super(itemView);

                title=itemView.findViewById(R.id.title);
                fee=itemView.findViewById(R.id.fee);
                pic=itemView.findViewById(R.id.pic);
                addBtn=itemView.findViewById(R.id.addBtn);

            }
        }
    }
