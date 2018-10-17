package io.fabre.frederic;

import io.fabre.frederic.util.ChecksumUtil;
import org.junit.Assert;
import org.junit.Test;

public class ChecksumTest {

    @Test
    public void testSHA256() {
        // given
        final String expectedChecksum = "6ffb23f3b38df61c5e24030419f9610587a71ac76602124ee587e6b51dc13ed9";
        // when
        String checksum = null;
        try {
            checksum = ChecksumUtil.getSHA256Checksum("src/main/resources/io/fabre/frederic/test.jpg");
        } catch (final io.fabre.frederic.util.ChecksumException e) {
            System.out.println(e);
        }

        // then
        Assert.assertEquals("The SHA-256 checksum is incorrect", expectedChecksum, checksum);
    }

    @Test
    public void testMD5() {
        // given
        final String expectedChecksum = "f09fe2a818d2f7fa1ccdc1d4b4b71c13";
        // when
        String checksum = null;
        try {
            checksum = ChecksumUtil.getMD5Checksum("src/main/resources/io/fabre/frederic/test.jpg");
        } catch (final io.fabre.frederic.util.ChecksumException e) {
            System.out.println(e);
        }

        // then
        Assert.assertEquals("The MD5 checksum is incorrect", expectedChecksum, checksum);
    }
}
