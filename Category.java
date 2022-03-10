        package com.example.intent;


        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.constraintlayout.widget.ConstraintLayout;
        import androidx.core.content.ContextCompat;
        import androidx.recyclerview.widget.RecyclerView;

        import com.bumptech.glide.Glide;

        import java.util.ArrayList;

        public class Category extends RecyclerView.Adapter<Category.viewholder> {
        ArrayList<CategoryDomain> categoryDomains;

        public Category(ArrayList<CategoryDomain> categoryDomains) {
            this.categoryDomains = categoryDomains;
        }

        @NonNull
        @Override
        public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_cat,parent,false);

            return new viewholder(inflate);
        }

        @Override
        public void onBindViewHolder(@NonNull viewholder holder, int position) {

            holder.categoryName.setText(categoryDomains.get(position).getTitle());
            String picUrl = "";

            switch (position) {

                case 0: {

                    picUrl = "cat_1";

                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.caregory_back1));

                    break;
                }

                // case zero //

                case 1: {

                    picUrl = "cat_2";

                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.caregory_back2));

                    break;
                }
                // case one //

                case 2: {

                    picUrl = "cat_3";

                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.caregory_back3));

                    break;
                }
                // case two //

                case 3: {

                    picUrl = "cat_4";

                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.caregory_back4));

                    break;
                }

                // case three //

                case 4: {

                    picUrl = "cat_5";

                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.caregory_back5));

                    break;
                }

                // case four //

            }


            int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picUrl, "drawable", holder.itemView.getContext().getPackageName());



                Glide
                        .with(holder.itemView.getContext())

                        .load(drawableResourceId)
                        .into(holder.categoryPic);





        }


        @Override
        public int getItemCount() {


            return categoryDomains.size();
        }

        public class viewholder extends RecyclerView.ViewHolder{

         ImageView categoryPic;

         TextView categoryName;

         ConstraintLayout mainLayout;


            public viewholder(@NonNull View itemView) {
                super(itemView);

                categoryName=itemView.findViewById(R.id.categoryName);
                categoryPic=itemView.findViewById(R.id.categoryPic);
                mainLayout=itemView.findViewById(R.id.mainLayout);

            }
        }
    }
