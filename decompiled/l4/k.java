package l4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import com.tencent.bugly.proguard.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.lifecycle.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.v f8013a;

    public k(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.v vVar) {
        this.f8013a = vVar;
    }

    @Override // androidx.lifecycle.e
    public final void a(androidx.lifecycle.t tVar) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i0(2), 500L);
        this.f8013a.f(this);
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void b(androidx.lifecycle.t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void d(androidx.lifecycle.t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void e(androidx.lifecycle.t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void g(androidx.lifecycle.t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void h(androidx.lifecycle.t tVar) {
    }
}
