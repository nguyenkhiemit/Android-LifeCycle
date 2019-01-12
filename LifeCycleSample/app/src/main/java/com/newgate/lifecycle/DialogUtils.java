package com.newgate.lifecycle;

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class DialogUtils {

    public static void showAlertDialogExitsApp(Context context, String content) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_layout, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        TextView contentText = (TextView) view.findViewById(R.id.txt_content);
        if (!TextUtils.isEmpty(content))
            contentText.setText(content);
        TextView okButton = (TextView) view.findViewById(R.id.btn_ok);
        TextView noButton = (TextView) view.findViewById(R.id.btn_cancel);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
