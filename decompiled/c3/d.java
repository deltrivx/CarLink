package c3;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2369c = 0;

    public d(CharSequence charSequence, int i7) {
        this.f2367a = charSequence;
        this.f2368b = i7;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i7 = this.f2369c;
        if (i7 == this.f2368b) {
            return (char) 65535;
        }
        return this.f2367a.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f2369c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f2368b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f2369c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i7 = this.f2368b;
        if (i7 == 0) {
            this.f2369c = i7;
            return (char) 65535;
        }
        int i10 = i7 - 1;
        this.f2369c = i10;
        return this.f2367a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i7 = this.f2369c + 1;
        this.f2369c = i7;
        int i10 = this.f2368b;
        if (i7 < i10) {
            return this.f2367a.charAt(i7);
        }
        this.f2369c = i10;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i7 = this.f2369c;
        if (i7 <= 0) {
            return (char) 65535;
        }
        int i10 = i7 - 1;
        this.f2369c = i10;
        return this.f2367a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i7) {
        if (i7 > this.f2368b || i7 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f2369c = i7;
        return current();
    }
}
