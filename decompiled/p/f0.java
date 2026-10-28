package p;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        e4.c dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                dVar = new a2.d(clipData, 3);
            } else {
                e4.d dVar2 = new e4.d(0);
                dVar2.f4327b = clipData;
                dVar2.f4328c = 3;
                dVar = dVar2;
            }
            e4.l0.h(textView, dVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        e4.c dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new a2.d(clipData, 3);
        } else {
            e4.d dVar2 = new e4.d(0);
            dVar2.f4327b = clipData;
            dVar2.f4328c = 3;
            dVar = dVar2;
        }
        e4.l0.h(view, dVar.build());
        return true;
    }
}
