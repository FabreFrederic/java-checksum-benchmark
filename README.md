# Benchmarking for measuring the performance of files checksum generation 

The benchmark class : ChecksumBenchmark.java
<br />
The checksum generation class : ChecksumUtil.java

## Build and launch the tests

```bash
maven clean install
java -jar target/benchmarks.jar
```

## Results of the Benchmark

```bash
Benchmark                             Mode  Cnt   Score   Error  Units
ChecksumBenchmark.MD5_image_337KB     avgt    5   0.928 ± 0.106  ms/op
ChecksumBenchmark.MD5_pdf_8MB         avgt    5  23.177 ± 1.342  ms/op
ChecksumBenchmark.SHA256_image_337KB  avgt    5   2.165 ± 0.061  ms/op
ChecksumBenchmark.SHA256_pdf_8MB      avgt   20  56.305 ± 1.367  ms/op
```
Score in ms / operation


```bash
Result "io.fabre.frederic.benchmark.ChecksumBenchmark.MD5_image_337KB":
  0.928 ±(99.9%) 0.106 ms/op [Average]
  (min, avg, max) = (0.906, 0.928, 0.974), stdev = 0.028
  CI (99.9%): [0.822, 1.035] (assumes normal distribution)

Result "io.fabre.frederic.benchmark.ChecksumBenchmark.MD5_pdf_8MB":
  23.177 ±(99.9%) 1.342 ms/op [Average]
  (min, avg, max) = (22.921, 23.177, 23.620), stdev = 0.348
  CI (99.9%): [21.835, 24.518] (assumes normal distribution)

Result "io.fabre.frederic.benchmark.ChecksumBenchmark.SHA256_image_337KB":
  2.165 ±(99.9%) 0.061 ms/op [Average]
  (min, avg, max) = (2.146, 2.165, 2.188), stdev = 0.016
  CI (99.9%): [2.104, 2.226] (assumes normal distribution)


Result "io.fabre.frederic.benchmark.ChecksumBenchmark.SHA256_pdf_8MB":
  56.305 ±(99.9%) 1.367 ms/op [Average]
  (min, avg, max) = (54.844, 56.305, 60.009), stdev = 1.574
  CI (99.9%): [54.939, 57.672] (assumes normal distribution)
```


