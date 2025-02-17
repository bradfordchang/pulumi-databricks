// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDbfsFilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbfsFilePlainArgs Empty = new GetDbfsFilePlainArgs();

    /**
     * Do not load content for files larger than 4MB.
     * 
     */
    @Import(name="limitFileSize", required=true)
    private Boolean limitFileSize;

    /**
     * @return Do not load content for files larger than 4MB.
     * 
     */
    public Boolean limitFileSize() {
        return this.limitFileSize;
    }

    /**
     * Path on DBFS for the file from which to get content.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Path on DBFS for the file from which to get content.
     * 
     */
    public String path() {
        return this.path;
    }

    private GetDbfsFilePlainArgs() {}

    private GetDbfsFilePlainArgs(GetDbfsFilePlainArgs $) {
        this.limitFileSize = $.limitFileSize;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbfsFilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbfsFilePlainArgs $;

        public Builder() {
            $ = new GetDbfsFilePlainArgs();
        }

        public Builder(GetDbfsFilePlainArgs defaults) {
            $ = new GetDbfsFilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitFileSize Do not load content for files larger than 4MB.
         * 
         * @return builder
         * 
         */
        public Builder limitFileSize(Boolean limitFileSize) {
            $.limitFileSize = limitFileSize;
            return this;
        }

        /**
         * @param path Path on DBFS for the file from which to get content.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public GetDbfsFilePlainArgs build() {
            $.limitFileSize = Objects.requireNonNull($.limitFileSize, "expected parameter 'limitFileSize' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
