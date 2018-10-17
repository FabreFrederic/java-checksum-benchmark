/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

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
