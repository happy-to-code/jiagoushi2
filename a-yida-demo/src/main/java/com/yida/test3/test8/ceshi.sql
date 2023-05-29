####卖方#### 判断当前用户ID=该基金发布者ID
#卖方发起的所有买方没有回复的留言单独归类
SELECT t.* FROM  fund_v_communication t,fund_info a WHERE t.fund_id=41 AND t.is_parent=-1 AND t.fund_id=a.id AND a.publish_user_id=t.userid AND buyer_id IS NULL
    #买方发起的卖方没有回复的留言单独归类
SELECT t.* FROM  fund_v_communication t,fund_info a WHERE t.fund_id=41 AND t.is_parent=-1 AND t.fund_id=a.id AND a.publish_user_id!=t.userid AND t.seller_id IS NULL;
#买卖回复对象组数
SELECT  t.fund_id,t.buyer_id FROM  fund_v_communication t WHERE t.fund_id=41 AND t.buyer_id IS NOT NULL AND t.seller_id IS NOT NULL
GROUP BY t.fund_id,t.buyer_id;
#按买卖方分别读取
SELECT t.* FROM  fund_v_communication t WHERE t.fund_id=41 AND t.buyer_id='1660131819632279553' AND t.seller_id='当前传入的用户ID即卖家ID';
SELECT t.* FROM  fund_v_communication t WHERE t.fund_id=41 AND t.buyer_id='1660935538716278786' AND t.seller_id='当前传入的用户ID即卖家ID';

####买方####  判断当前用户ID！该基金发布者ID
#卖方发起的该买方没有回复的留言单独归类
SELECT t.* FROM  fund_v_communication t,fund_info a WHERE t.fund_id=41 AND t.is_parent=-1 AND t.fund_id=a.id AND a.publish_user_id=t.userid AND (buyer_id IS NULL  OR buyer_id<>'当前传入的用户ID即买家ID');
#该买方发起的卖方没有回复的留言单独归类
SELECT t.* FROM  fund_v_communication t,fund_info a WHERE t.fund_id=41 AND t.is_parent=-1 AND t.fund_id=a.id AND a.publish_user_id!=t.userid AND t.seller_id IS NULL AND t.userid='当前传入的用户ID即买家ID';
#该买家和卖家回复对象
SELECT t.* FROM  fund_v_communication t WHERE t.fund_id=41 AND t.buyer_id='当前传入的用户ID即买家ID' ;

#该买家和卖家回复对象
SELECT t.* FROM  fund_v_communication t WHERE t.fund_id=41 AND t.buyer_id='1660935538716278786'  AND t.seller_id IS NOT NULL;