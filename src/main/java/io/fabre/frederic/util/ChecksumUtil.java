package io.fabre.frederic.util;

import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The type Checksum util.
 */
public class ChecksumUtil {

    /**
     * Gets md5 checksum.
     *
     * @param filePath the file path
     * @return the md 5 checksum
     * @throws ChecksumException the checksum exception
     */
    public static String getMD5Checksum(final String filePath)
            throws ChecksumException {
        return getChecksum("MD5", filePath);
    }

    /**
     * Gets sha256 checksum.
     *
     * @param filePath the file path
     * @return the sha 256 checksum
     * @throws ChecksumException the checksum exception
     */
    public static String getSHA256Checksum(final String filePath)
            throws ChecksumException {
        return getChecksum("SHA-256", filePath);
    }

    private static String getChecksum(final String hashType, final String filePath)
            throws ChecksumException {
        final MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(hashType);
        } catch (final NoSuchAlgorithmException e) {
            throw new ChecksumException(String.format("Algorithm '%s' is not supported", hashType), e);
        }
        return calculateFileChecksum(filePath, messageDigest);
    }

    private static String calculateFileChecksum(final String filePath, final MessageDigest messageDigest)
            throws ChecksumException {
        final StringBuilder checksum = new StringBuilder();

        try (
                FileInputStream inputStream = new FileInputStream(filePath);
                DigestInputStream digestInputStream = new DigestInputStream(inputStream, messageDigest)
        ) {
            final byte[] buffer = new byte[4096];
            while (digestInputStream.read(buffer) > -1) {
            }
            final MessageDigest digest = digestInputStream.getMessageDigest();
            final byte[] md5 = digest.digest();
            for (byte b : md5) {
                checksum.append(String.format("%02X", b));
            }
        } catch (final Exception e) {
            throw new ChecksumException(String.format("Error while calculating the hash file of : '%s'",
                    filePath), e);
        }
        return checksum.toString().toLowerCase();
    }
}
