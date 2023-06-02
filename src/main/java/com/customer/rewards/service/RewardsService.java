package com.customer.rewards.service;

import com.customer.rewards.model.Rewards;
public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
