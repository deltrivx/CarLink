package oa;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f9604a = new e(h.f9592b, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f9605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f9606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f9607d;

    static {
        h hVar = h.f9593c;
        f9605b = new e(hVar, false);
        f9606c = new e(hVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        q qVar = new q(0);
        new android.support.v4.media.session.r(qVar, "java/util/".concat("Iterator")).w("forEachRemaining", null, new j(0, strConcat4));
        new android.support.v4.media.session.r(qVar, "java/lang/".concat("Iterable")).w("spliterator", null, new o(4));
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(qVar, "java/util/".concat("Collection"));
        rVar.w("removeIf", null, new j(17, strConcat2));
        rVar.w("stream", null, new j(26, strConcat8));
        rVar.w("parallelStream", null, new l(1, strConcat8));
        android.support.v4.media.session.r rVar2 = new android.support.v4.media.session.r(qVar, "java/util/".concat("List"));
        rVar2.w("replaceAll", null, new l(2, strConcat7));
        rVar2.w("addFirst", "2.1", new l(3, strConcat));
        rVar2.w("addLast", "2.1", new l(4, strConcat));
        rVar2.w("removeFirst", "2.1", new l(5, strConcat));
        rVar2.w("removeLast", "2.1", new l(6, strConcat));
        android.support.v4.media.session.r rVar3 = new android.support.v4.media.session.r(qVar, "java/util/".concat("LinkedList"));
        rVar3.w("addFirst", "2.1", new j(1, strConcat));
        rVar3.w("addLast", "2.1", new j(2, strConcat));
        rVar3.w("removeFirst", "2.1", new j(3, strConcat));
        rVar3.w("removeLast", "2.1", new j(4, strConcat));
        android.support.v4.media.session.r rVar4 = new android.support.v4.media.session.r(qVar, "java/util/".concat("LinkedHashSet"));
        rVar4.w("addFirst", "2.2", new j(5, strConcat));
        rVar4.w("addLast", "2.2", new j(6, strConcat));
        rVar4.w("removeFirst", "2.2", new j(7, strConcat));
        rVar4.w("removeLast", "2.2", new j(8, strConcat));
        rVar4.w("getFirst", "2.2", new j(9, strConcat));
        rVar4.w("getLast", "2.2", new j(10, strConcat));
        android.support.v4.media.session.r rVar5 = new android.support.v4.media.session.r(qVar, "java/util/".concat("Map"));
        rVar5.w("forEach", null, new j(11, strConcat6));
        rVar5.w("putIfAbsent", null, new j(12, strConcat));
        rVar5.w("replace", null, new j(13, strConcat));
        rVar5.w("replace", null, new j(14, strConcat));
        rVar5.w("replaceAll", null, new j(15, strConcat5));
        rVar5.w("compute", null, new k(strConcat, strConcat5, 0));
        rVar5.w("computeIfAbsent", null, new k(strConcat, strConcat3, 1));
        rVar5.w("computeIfPresent", null, new k(strConcat, strConcat5, 2));
        rVar5.w("merge", null, new k(strConcat, strConcat5, 3));
        android.support.v4.media.session.r rVar6 = new android.support.v4.media.session.r(qVar, "java/util/".concat("LinkedHashMap"));
        rVar6.w("putFirst", "2.2", new j(16, strConcat));
        rVar6.w("putLast", "2.2", new j(18, strConcat));
        android.support.v4.media.session.r rVar7 = new android.support.v4.media.session.r(qVar, strConcat9);
        rVar7.w("empty", null, new j(19, strConcat9));
        rVar7.w("of", null, new k(strConcat, strConcat9, 4));
        rVar7.w("ofNullable", null, new k(strConcat, strConcat9, 5));
        rVar7.w("get", null, new j(20, strConcat));
        rVar7.w("ifPresent", null, new j(21, strConcat4));
        new android.support.v4.media.session.r(qVar, "java/lang/".concat("ref/Reference")).w("get", null, new j(22, strConcat));
        new android.support.v4.media.session.r(qVar, strConcat2).w("test", null, new j(23, strConcat));
        new android.support.v4.media.session.r(qVar, "java/util/function/".concat("BiPredicate")).w("test", null, new j(24, strConcat));
        new android.support.v4.media.session.r(qVar, strConcat4).w("accept", null, new j(25, strConcat));
        new android.support.v4.media.session.r(qVar, strConcat6).w("accept", null, new j(27, strConcat));
        new android.support.v4.media.session.r(qVar, strConcat3).w("apply", null, new j(28, strConcat));
        new android.support.v4.media.session.r(qVar, strConcat5).w("apply", null, new j(29, strConcat));
        new android.support.v4.media.session.r(qVar, "java/util/function/".concat("Supplier")).w("get", null, new l(0, strConcat));
        f9607d = qVar.f9620a;
    }
}
