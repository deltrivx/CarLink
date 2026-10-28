package e4;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo contentInfoH = fVar.f4342a.h();
        Objects.requireNonNull(contentInfoH);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoH);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoH ? fVar : new f(new a2.d(contentInfoPerformReceiveContent));
    }
}
