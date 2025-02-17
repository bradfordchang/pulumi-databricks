// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskConditionTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskConditionTaskArgs Empty = new JobTaskConditionTaskArgs();

    @Import(name="left")
    private @Nullable Output<String> left;

    public Optional<Output<String>> left() {
        return Optional.ofNullable(this.left);
    }

    /**
     * string specifying the operation used to evaluate the given metric. The only supported operation is `GREATER_THAN`.
     * 
     */
    @Import(name="op")
    private @Nullable Output<String> op;

    /**
     * @return string specifying the operation used to evaluate the given metric. The only supported operation is `GREATER_THAN`.
     * 
     */
    public Optional<Output<String>> op() {
        return Optional.ofNullable(this.op);
    }

    @Import(name="right")
    private @Nullable Output<String> right;

    public Optional<Output<String>> right() {
        return Optional.ofNullable(this.right);
    }

    private JobTaskConditionTaskArgs() {}

    private JobTaskConditionTaskArgs(JobTaskConditionTaskArgs $) {
        this.left = $.left;
        this.op = $.op;
        this.right = $.right;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskConditionTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskConditionTaskArgs $;

        public Builder() {
            $ = new JobTaskConditionTaskArgs();
        }

        public Builder(JobTaskConditionTaskArgs defaults) {
            $ = new JobTaskConditionTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder left(@Nullable Output<String> left) {
            $.left = left;
            return this;
        }

        public Builder left(String left) {
            return left(Output.of(left));
        }

        /**
         * @param op string specifying the operation used to evaluate the given metric. The only supported operation is `GREATER_THAN`.
         * 
         * @return builder
         * 
         */
        public Builder op(@Nullable Output<String> op) {
            $.op = op;
            return this;
        }

        /**
         * @param op string specifying the operation used to evaluate the given metric. The only supported operation is `GREATER_THAN`.
         * 
         * @return builder
         * 
         */
        public Builder op(String op) {
            return op(Output.of(op));
        }

        public Builder right(@Nullable Output<String> right) {
            $.right = right;
            return this;
        }

        public Builder right(String right) {
            return right(Output.of(right));
        }

        public JobTaskConditionTaskArgs build() {
            return $;
        }
    }

}
