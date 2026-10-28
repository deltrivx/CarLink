package d3;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BreakIterator f3759c;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f3759c = characterInstance;
    }

    @Override // g5.a
    public final int U(int i7) {
        return this.f3759c.following(i7);
    }

    @Override // g5.a
    public final int W(int i7) {
        return this.f3759c.preceding(i7);
    }
}
