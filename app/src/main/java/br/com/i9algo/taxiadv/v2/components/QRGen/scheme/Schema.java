package br.com.i9algo.taxiadv.v2.components.QRGen.scheme;

/**
 * Abstract schema class
 *
 */
public abstract class Schema {

    Schema() {
        super();
    }

    /**
     * Parse qr code schema for given code string.
     *
     * @param code
     * @return schema
     */
    public abstract Schema parseSchema(String code);

    /**
     * Generates code string.
     *
     * @return code
     */
    public abstract String generateString();
}