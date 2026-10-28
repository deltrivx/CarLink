package l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ObjectAnimator f7564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7565g;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i7 = z10 ? numberOfFrames - 1 : 0;
        int i10 = z10 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f7567b = numberOfFrames2;
        int[] iArr = dVar.f7566a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f7566a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f7566a;
        int i11 = 0;
        for (int i12 = 0; i12 < numberOfFrames2; i12++) {
            int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i12) - 1 : i12);
            iArr2[i12] = duration;
            i11 += duration;
        }
        dVar.f7568c = i11;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i10);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(dVar.f7568c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f7565g = z11;
        this.f7564f = objectAnimatorOfInt;
    }

    @Override // a.a
    public final void R() {
        this.f7564f.reverse();
    }

    @Override // a.a
    public final void U() {
        this.f7564f.start();
    }

    @Override // a.a
    public final void V() {
        this.f7564f.cancel();
    }

    @Override // a.a
    public final boolean m() {
        return this.f7565g;
    }
}
