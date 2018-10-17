package io.fabre.frederic.benchmark;

import io.fabre.frederic.util.ChecksumException;
import io.fabre.frederic.util.ChecksumUtil;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

public class ChecksumBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 5)
    public void MD5_pdf_8MB() {
        try {
            ChecksumUtil.getMD5Checksum("src/main/resources/io/fabre/frederic/test.pdf");
        } catch (ChecksumException e) {
            System.out.println(e);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 5)
    public void SHA256_pdf_8MB() {
        try {
            ChecksumUtil.getSHA256Checksum("src/main/resources/io/fabre/frederic/test.pdf");
        } catch (ChecksumException e) {
            System.out.println(e);
        }
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 5)
    public void MD5_image_337KB() {
        try {
            ChecksumUtil.getMD5Checksum("src/main/resources/io/fabre/frederic/test.jpg");
        } catch (ChecksumException e) {
            System.out.println(e);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 5)
    public void SHA256_image_337KB() {
        try {
            ChecksumUtil.getSHA256Checksum("src/main/resources/io/fabre/frederic/test.jpg");
        } catch (ChecksumException e) {
            System.out.println(e);
        }
    }
}
