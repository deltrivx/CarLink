package q6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public interface b extends c7.a {
    Activity getActivity();

    Bundle getArguments();

    boolean isAdded();

    boolean isRemoving();

    void requestPermissions(String[] strArr, int i7);

    void setArguments(Bundle bundle);

    void setRetainInstance(boolean z10);

    @Override // c7.a
    /* synthetic */ void startActivity(Intent intent);

    @Override // c7.a
    /* synthetic */ void startActivityForResult(Intent intent, int i7);
}
