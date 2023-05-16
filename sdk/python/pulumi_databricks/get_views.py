# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetViewsResult',
    'AwaitableGetViewsResult',
    'get_views',
    'get_views_output',
]

@pulumi.output_type
class GetViewsResult:
    """
    A collection of values returned by getViews.
    """
    def __init__(__self__, catalog_name=None, id=None, ids=None, schema_name=None):
        if catalog_name and not isinstance(catalog_name, str):
            raise TypeError("Expected argument 'catalog_name' to be a str")
        pulumi.set(__self__, "catalog_name", catalog_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if schema_name and not isinstance(schema_name, str):
            raise TypeError("Expected argument 'schema_name' to be a str")
        pulumi.set(__self__, "schema_name", schema_name)

    @property
    @pulumi.getter(name="catalogName")
    def catalog_name(self) -> str:
        return pulumi.get(self, "catalog_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        set of databricks_view full names: *`catalog`.`schema`.`view`*
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> str:
        return pulumi.get(self, "schema_name")


class AwaitableGetViewsResult(GetViewsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetViewsResult(
            catalog_name=self.catalog_name,
            id=self.id,
            ids=self.ids,
            schema_name=self.schema_name)


def get_views(catalog_name: Optional[str] = None,
              ids: Optional[Sequence[str]] = None,
              schema_name: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetViewsResult:
    """
    ## Example Usage

    Granting `SELECT` and `MODIFY` to `sensitive` group on all views in a _things_ Schema from _sandbox_ databricks_catalog.

    ```python
    import pulumi
    import pulumi_databricks as databricks

    things_views = databricks.get_views(catalog_name="sandbox",
        schema_name="things")
    things_grants = []
    for range in [{"key": k, "value": v} for [k, v] in enumerate(things_views.ids)]:
        things_grants.append(databricks.Grants(f"thingsGrants-{range['key']}",
            view=range["value"],
            grants=[databricks.GrantsGrantArgs(
                principal="sensitive",
                privileges=[
                    "SELECT",
                    "MODIFY",
                ],
            )]))
    ```
    ## Related Resources

    The following resources are used in the same context:

    * Schema to manage schemas within Unity Catalog.
    * Catalog to manage catalogs within Unity Catalog.


    :param str catalog_name: Name of databricks_catalog
    :param Sequence[str] ids: set of databricks_view full names: *`catalog`.`schema`.`view`*
    :param str schema_name: Name of databricks_schema
    """
    __args__ = dict()
    __args__['catalogName'] = catalog_name
    __args__['ids'] = ids
    __args__['schemaName'] = schema_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getViews:getViews', __args__, opts=opts, typ=GetViewsResult).value

    return AwaitableGetViewsResult(
        catalog_name=__ret__.catalog_name,
        id=__ret__.id,
        ids=__ret__.ids,
        schema_name=__ret__.schema_name)


@_utilities.lift_output_func(get_views)
def get_views_output(catalog_name: Optional[pulumi.Input[str]] = None,
                     ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                     schema_name: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetViewsResult]:
    """
    ## Example Usage

    Granting `SELECT` and `MODIFY` to `sensitive` group on all views in a _things_ Schema from _sandbox_ databricks_catalog.

    ```python
    import pulumi
    import pulumi_databricks as databricks

    things_views = databricks.get_views(catalog_name="sandbox",
        schema_name="things")
    things_grants = []
    for range in [{"key": k, "value": v} for [k, v] in enumerate(things_views.ids)]:
        things_grants.append(databricks.Grants(f"thingsGrants-{range['key']}",
            view=range["value"],
            grants=[databricks.GrantsGrantArgs(
                principal="sensitive",
                privileges=[
                    "SELECT",
                    "MODIFY",
                ],
            )]))
    ```
    ## Related Resources

    The following resources are used in the same context:

    * Schema to manage schemas within Unity Catalog.
    * Catalog to manage catalogs within Unity Catalog.


    :param str catalog_name: Name of databricks_catalog
    :param Sequence[str] ids: set of databricks_view full names: *`catalog`.`schema`.`view`*
    :param str schema_name: Name of databricks_schema
    """
    ...
