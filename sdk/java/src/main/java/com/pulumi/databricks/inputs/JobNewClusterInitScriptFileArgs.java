// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNewClusterInitScriptFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterInitScriptFileArgs Empty = new JobNewClusterInitScriptFileArgs();

    @Import(name="destination")
    private @Nullable Output<String> destination;

    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    private JobNewClusterInitScriptFileArgs() {}

    private JobNewClusterInitScriptFileArgs(JobNewClusterInitScriptFileArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterInitScriptFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterInitScriptFileArgs $;

        public Builder() {
            $ = new JobNewClusterInitScriptFileArgs();
        }

        public Builder(JobNewClusterInitScriptFileArgs defaults) {
            $ = new JobNewClusterInitScriptFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public JobNewClusterInitScriptFileArgs build() {
            return $;
        }
    }

}