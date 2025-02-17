// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SqlPermissionsPrivilegeAssignment {
    /**
     * @return `display_name` for a databricks.Group or databricks_user, `application_id` for a databricks_service_principal.
     * 
     */
    private String principal;
    /**
     * @return set of available privilege names in upper case.
     * 
     * [Available](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html) privilege names are:
     * 
     */
    private List<String> privileges;

    private SqlPermissionsPrivilegeAssignment() {}
    /**
     * @return `display_name` for a databricks.Group or databricks_user, `application_id` for a databricks_service_principal.
     * 
     */
    public String principal() {
        return this.principal;
    }
    /**
     * @return set of available privilege names in upper case.
     * 
     * [Available](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html) privilege names are:
     * 
     */
    public List<String> privileges() {
        return this.privileges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlPermissionsPrivilegeAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String principal;
        private List<String> privileges;
        public Builder() {}
        public Builder(SqlPermissionsPrivilegeAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principal = defaults.principal;
    	      this.privileges = defaults.privileges;
        }

        @CustomType.Setter
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        @CustomType.Setter
        public Builder privileges(List<String> privileges) {
            this.privileges = Objects.requireNonNull(privileges);
            return this;
        }
        public Builder privileges(String... privileges) {
            return privileges(List.of(privileges));
        }
        public SqlPermissionsPrivilegeAssignment build() {
            final var _resultValue = new SqlPermissionsPrivilegeAssignment();
            _resultValue.principal = principal;
            _resultValue.privileges = privileges;
            return _resultValue;
        }
    }
}
