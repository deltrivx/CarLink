package da;

import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f3876i = new j(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // h9.k
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        i9.l.e(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
