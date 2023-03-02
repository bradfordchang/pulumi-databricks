// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RepoSparseCheckoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepoSparseCheckoutArgs Empty = new RepoSparseCheckoutArgs();

    @Import(name="patterns", required=true)
    private Output<List<String>> patterns;

    public Output<List<String>> patterns() {
        return this.patterns;
    }

    private RepoSparseCheckoutArgs() {}

    private RepoSparseCheckoutArgs(RepoSparseCheckoutArgs $) {
        this.patterns = $.patterns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepoSparseCheckoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoSparseCheckoutArgs $;

        public Builder() {
            $ = new RepoSparseCheckoutArgs();
        }

        public Builder(RepoSparseCheckoutArgs defaults) {
            $ = new RepoSparseCheckoutArgs(Objects.requireNonNull(defaults));
        }

        public Builder patterns(Output<List<String>> patterns) {
            $.patterns = patterns;
            return this;
        }

        public Builder patterns(List<String> patterns) {
            return patterns(Output.of(patterns));
        }

        public Builder patterns(String... patterns) {
            return patterns(List.of(patterns));
        }

        public RepoSparseCheckoutArgs build() {
            $.patterns = Objects.requireNonNull($.patterns, "expected parameter 'patterns' to be non-null");
            return $;
        }
    }

}