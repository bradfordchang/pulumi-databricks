// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class JobNewClusterInitScriptDbfsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterInitScriptDbfsArgs Empty = new JobNewClusterInitScriptDbfsArgs();

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private JobNewClusterInitScriptDbfsArgs() {}

    private JobNewClusterInitScriptDbfsArgs(JobNewClusterInitScriptDbfsArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterInitScriptDbfsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterInitScriptDbfsArgs $;

        public Builder() {
            $ = new JobNewClusterInitScriptDbfsArgs();
        }

        public Builder(JobNewClusterInitScriptDbfsArgs defaults) {
            $ = new JobNewClusterInitScriptDbfsArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public JobNewClusterInitScriptDbfsArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            return $;
        }
    }

}
