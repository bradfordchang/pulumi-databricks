// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobContinuous {
    /**
     * @return Indicate whether this schedule is paused or not. Either “PAUSED” or “UNPAUSED”. When the pause_status field is omitted and a schedule is provided, the server will default to using &#34;UNPAUSED&#34; as a value for pause_status.
     * 
     */
    private @Nullable String pauseStatus;

    private JobContinuous() {}
    /**
     * @return Indicate whether this schedule is paused or not. Either “PAUSED” or “UNPAUSED”. When the pause_status field is omitted and a schedule is provided, the server will default to using &#34;UNPAUSED&#34; as a value for pause_status.
     * 
     */
    public Optional<String> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobContinuous defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pauseStatus;
        public Builder() {}
        public Builder(JobContinuous defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pauseStatus = defaults.pauseStatus;
        }

        @CustomType.Setter
        public Builder pauseStatus(@Nullable String pauseStatus) {
            this.pauseStatus = pauseStatus;
            return this;
        }
        public JobContinuous build() {
            final var o = new JobContinuous();
            o.pauseStatus = pauseStatus;
            return o;
        }
    }
}