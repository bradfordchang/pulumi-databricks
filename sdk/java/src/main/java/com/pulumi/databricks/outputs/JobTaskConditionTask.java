// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskConditionTask {
    private @Nullable String left;
    /**
     * @return string specifying the operation used to evaluate the given metric. The only supported operation is `GREATER_THAN`.
     * 
     */
    private @Nullable String op;
    private @Nullable String right;

    private JobTaskConditionTask() {}
    public Optional<String> left() {
        return Optional.ofNullable(this.left);
    }
    /**
     * @return string specifying the operation used to evaluate the given metric. The only supported operation is `GREATER_THAN`.
     * 
     */
    public Optional<String> op() {
        return Optional.ofNullable(this.op);
    }
    public Optional<String> right() {
        return Optional.ofNullable(this.right);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskConditionTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String left;
        private @Nullable String op;
        private @Nullable String right;
        public Builder() {}
        public Builder(JobTaskConditionTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.left = defaults.left;
    	      this.op = defaults.op;
    	      this.right = defaults.right;
        }

        @CustomType.Setter
        public Builder left(@Nullable String left) {
            this.left = left;
            return this;
        }
        @CustomType.Setter
        public Builder op(@Nullable String op) {
            this.op = op;
            return this;
        }
        @CustomType.Setter
        public Builder right(@Nullable String right) {
            this.right = right;
            return this;
        }
        public JobTaskConditionTask build() {
            final var _resultValue = new JobTaskConditionTask();
            _resultValue.left = left;
            _resultValue.op = op;
            _resultValue.right = right;
            return _resultValue;
        }
    }
}
