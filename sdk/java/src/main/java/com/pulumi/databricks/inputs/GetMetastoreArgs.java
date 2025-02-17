// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetMetastoreMetastoreInfoArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetastoreArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetastoreArgs Empty = new GetMetastoreArgs();

    /**
     * Id of the metastore to be fetched
     * 
     */
    @Import(name="metastoreId", required=true)
    private Output<String> metastoreId;

    /**
     * @return Id of the metastore to be fetched
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }

    /**
     * MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     * 
     */
    @Import(name="metastoreInfo")
    private @Nullable Output<GetMetastoreMetastoreInfoArgs> metastoreInfo;

    /**
     * @return MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     * 
     */
    public Optional<Output<GetMetastoreMetastoreInfoArgs>> metastoreInfo() {
        return Optional.ofNullable(this.metastoreInfo);
    }

    private GetMetastoreArgs() {}

    private GetMetastoreArgs(GetMetastoreArgs $) {
        this.metastoreId = $.metastoreId;
        this.metastoreInfo = $.metastoreInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetastoreArgs $;

        public Builder() {
            $ = new GetMetastoreArgs();
        }

        public Builder(GetMetastoreArgs defaults) {
            $ = new GetMetastoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metastoreId Id of the metastore to be fetched
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId Id of the metastore to be fetched
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param metastoreInfo MetastoreInfo object for a databricks_metastore. This contains the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder metastoreInfo(@Nullable Output<GetMetastoreMetastoreInfoArgs> metastoreInfo) {
            $.metastoreInfo = metastoreInfo;
            return this;
        }

        /**
         * @param metastoreInfo MetastoreInfo object for a databricks_metastore. This contains the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder metastoreInfo(GetMetastoreMetastoreInfoArgs metastoreInfo) {
            return metastoreInfo(Output.of(metastoreInfo));
        }

        public GetMetastoreArgs build() {
            $.metastoreId = Objects.requireNonNull($.metastoreId, "expected parameter 'metastoreId' to be non-null");
            return $;
        }
    }

}
