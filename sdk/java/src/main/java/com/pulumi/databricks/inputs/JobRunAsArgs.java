// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobRunAsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobRunAsArgs Empty = new JobRunAsArgs();

    /**
     * The application ID of an active service principal. Setting this field requires the `servicePrincipal/user` role.
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobRunAsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var this_ = new Job(&#34;this&#34;, JobArgs.builder()        
     *             .runAs(JobRunAsArgs.builder()
     *                 .servicePrincipalName(&#34;8d23ae77-912e-4a19-81e4-b9c3f5cc9349&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    @Import(name="servicePrincipalName")
    private @Nullable Output<String> servicePrincipalName;

    /**
     * @return The application ID of an active service principal. Setting this field requires the `servicePrincipal/user` role.
     * 
     * Example
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobRunAsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var this_ = new Job(&#34;this&#34;, JobArgs.builder()        
     *             .runAs(JobRunAsArgs.builder()
     *                 .servicePrincipalName(&#34;8d23ae77-912e-4a19-81e4-b9c3f5cc9349&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<String>> servicePrincipalName() {
        return Optional.ofNullable(this.servicePrincipalName);
    }

    /**
     * The email of an active workspace user. Non-admin users can only set this field to their own email.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The email of an active workspace user. Non-admin users can only set this field to their own email.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private JobRunAsArgs() {}

    private JobRunAsArgs(JobRunAsArgs $) {
        this.servicePrincipalName = $.servicePrincipalName;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobRunAsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobRunAsArgs $;

        public Builder() {
            $ = new JobRunAsArgs();
        }

        public Builder(JobRunAsArgs defaults) {
            $ = new JobRunAsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param servicePrincipalName The application ID of an active service principal. Setting this field requires the `servicePrincipal/user` role.
         * 
         * Example
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Job;
         * import com.pulumi.databricks.JobArgs;
         * import com.pulumi.databricks.inputs.JobRunAsArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var this_ = new Job(&#34;this&#34;, JobArgs.builder()        
         *             .runAs(JobRunAsArgs.builder()
         *                 .servicePrincipalName(&#34;8d23ae77-912e-4a19-81e4-b9c3f5cc9349&#34;)
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalName(@Nullable Output<String> servicePrincipalName) {
            $.servicePrincipalName = servicePrincipalName;
            return this;
        }

        /**
         * @param servicePrincipalName The application ID of an active service principal. Setting this field requires the `servicePrincipal/user` role.
         * 
         * Example
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Job;
         * import com.pulumi.databricks.JobArgs;
         * import com.pulumi.databricks.inputs.JobRunAsArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var this_ = new Job(&#34;this&#34;, JobArgs.builder()        
         *             .runAs(JobRunAsArgs.builder()
         *                 .servicePrincipalName(&#34;8d23ae77-912e-4a19-81e4-b9c3f5cc9349&#34;)
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalName(String servicePrincipalName) {
            return servicePrincipalName(Output.of(servicePrincipalName));
        }

        /**
         * @param userName The email of an active workspace user. Non-admin users can only set this field to their own email.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The email of an active workspace user. Non-admin users can only set this field to their own email.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public JobRunAsArgs build() {
            return $;
        }
    }

}
