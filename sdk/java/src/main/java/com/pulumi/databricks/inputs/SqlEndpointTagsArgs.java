// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlEndpointTagsCustomTagArgs;
import java.util.List;
import java.util.Objects;


public final class SqlEndpointTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlEndpointTagsArgs Empty = new SqlEndpointTagsArgs();

    @Import(name="customTags", required=true)
    private Output<List<SqlEndpointTagsCustomTagArgs>> customTags;

    public Output<List<SqlEndpointTagsCustomTagArgs>> customTags() {
        return this.customTags;
    }

    private SqlEndpointTagsArgs() {}

    private SqlEndpointTagsArgs(SqlEndpointTagsArgs $) {
        this.customTags = $.customTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlEndpointTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlEndpointTagsArgs $;

        public Builder() {
            $ = new SqlEndpointTagsArgs();
        }

        public Builder(SqlEndpointTagsArgs defaults) {
            $ = new SqlEndpointTagsArgs(Objects.requireNonNull(defaults));
        }

        public Builder customTags(Output<List<SqlEndpointTagsCustomTagArgs>> customTags) {
            $.customTags = customTags;
            return this;
        }

        public Builder customTags(List<SqlEndpointTagsCustomTagArgs> customTags) {
            return customTags(Output.of(customTags));
        }

        public Builder customTags(SqlEndpointTagsCustomTagArgs... customTags) {
            return customTags(List.of(customTags));
        }

        public SqlEndpointTagsArgs build() {
            $.customTags = Objects.requireNonNull($.customTags, "expected parameter 'customTags' to be non-null");
            return $;
        }
    }

}
