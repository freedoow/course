## (GCLogAnalysis)
### utOfMemoryError异常
* G1
>可以从日志看到当300m,会发生OutOfMemoryError异常
>老年代GC时长过短 引起GC
>

* Serial 
>各个内存区集合都值剩7%内存可使用，
* ParallelGc
>PSYoungGen 剩余一半，但eden区仅剩6%
>ParOldGen 基本已使用完毕
>Metaspace 剩余6%

**综上所述当调整参数200 甚至100m时几种GC想必都会会发生OutOfMemoryError异常**
**但在300M这个区间内 Serial≈ ParallelGc >G1**

##TODO待分析
* 1、发生GC的原因分析
* 2、晋升老年代不同分析
* 3、标记阶段不同分析
* 。。。。。