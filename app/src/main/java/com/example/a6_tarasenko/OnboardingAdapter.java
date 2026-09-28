package com.example.a6_tarasenko;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OnboardingAdapter extends RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder> {

    private final String[] titles = {
            "Анализы",
            "Уведомления",
            "Мониторинг"
    };

    private final String[] subtitles = {
            "Экспресс сбор и получение проб",
            "Вы быстро узнаете о результатах",
            "Наши врачи всегда наблюдают\nза вашими показателями здоровья"
    };

    private final int[] images = {
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.asset
    };

    @NonNull
    @Override
    public OnboardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_onboarding, parent, false);
        return new OnboardingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OnboardingViewHolder holder, int position) {
        holder.tvTitle.setText(titles[position]);
        holder.tvSubtitle.setText(subtitles[position]);
        holder.ivIllustration.setImageResource(images[position]);

        // Update dots state
        holder.dot1.setBackgroundResource(position == 0 ? R.drawable.dot_active : R.drawable.dot_inactive);
        holder.dot2.setBackgroundResource(position == 1 ? R.drawable.dot_active : R.drawable.dot_inactive);
        holder.dot3.setBackgroundResource(position == 2 ? R.drawable.dot_active : R.drawable.dot_inactive);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    static class OnboardingViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvSubtitle;
        ImageView ivIllustration;
        View dot1, dot2, dot3;

        public OnboardingViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvSubtitle = itemView.findViewById(R.id.tvSubtitle);
            ivIllustration = itemView.findViewById(R.id.ivIllustration);
            dot1 = itemView.findViewById(R.id.dot1);
            dot2 = itemView.findViewById(R.id.dot2);
            dot3 = itemView.findViewById(R.id.dot3);
        }
    }
}
