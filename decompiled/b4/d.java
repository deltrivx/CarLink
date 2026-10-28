package b4;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentProviderClient f1477b;

    public d(Context context, Uri uri, int i7) {
        this.f1476a = i7;
        switch (i7) {
            case 1:
                this.f1477b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f1477b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() throws Exception {
        switch (this.f1476a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f1477b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f1477b;
                if (contentProviderClient2 != 0) {
                    if (contentProviderClient2 instanceof AutoCloseable) {
                        contentProviderClient2.close();
                    } else if (!(contentProviderClient2 instanceof ExecutorService)) {
                        contentProviderClient2.release();
                    } else {
                        a4.h.w((ExecutorService) contentProviderClient2);
                    }
                }
                break;
        }
    }
}
